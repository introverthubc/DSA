class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        magazine_count = Counter(magazine)
        for char,count in Counter(ransomNote).items():
            if magazine_count[char] < count:
                return False
        return True