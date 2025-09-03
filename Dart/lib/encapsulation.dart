class Encapsulation {
  String? _name;

  String getName() {
    return _name ?? 'Unknown';
  }

  void setName(String newName) {
    _name = newName;
  }
}
