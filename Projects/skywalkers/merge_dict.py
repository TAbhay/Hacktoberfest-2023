from collections import defaultdict
#merge two or more dicts using the collections module
def merge_dicts(*dicts):
  mdict = defaultdict(list)
  for d in dicts:
    for key in d:
      mdict[key].append(d[key])
  return dict(mdict)
