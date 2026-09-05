class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        words = {}
        for s in strs:
            sortedWord = ''.join(sorted(s))
            if sortedWord not in words:
                words[sortedWord] = []
            words[sortedWord].append(s)
        return list(words.values())   