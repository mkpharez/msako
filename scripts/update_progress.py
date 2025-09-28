import json
import requests
from datetime import datetime
import os

REPO = "mkpharez/msako"
URL = f"https://api.github.com/repos/{REPO}/issues?state=all&per_page=100"
resp = requests.get(URL)
issues = resp.json()

total = len(issues)
closed = sum(1 for i in issues if i["state"] == "closed")

os.makedirs("metrics", exist_ok=True)
with open("metrics/progress.json", "w") as f:
    json.dump({
        "date": datetime.utcnow().isoformat(),
        "total_issues": total,
        "closed_issues": closed
    }, f, indent=2)

print("Metrics updated")
