/* global jQuery:false, $:false */
define(function () {
  var _$ = jQuery || $;

  if (_$ == null && console && console.error) {
    console.error(
      'Select2: An instance of jQuery or a jQuery-compatible user was not ' +
      'found. Make sure that you are including jQuery before Select2 on your ' +
      'user page.'
    );
  }

  return _$;
});
