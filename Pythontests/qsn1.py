import re

def is_valid_string(s):
    if len(s) < 6:
        return False
    
    num_count = sum(c.isdigit() for c in s)
    if num_count < 2 or num_count > 3:
        return False
    
    if re.search(r"\d{2,}", s):
        return False
    
    return True
