import React from 'react';
import Modal from 'react-modal';

// Make sure to set the app element for react-modal accessibility
Modal.setAppElement('#root');

const Popup = ({ isOpen, onClose, message }) => {
  return (
    <Modal isOpen={isOpen} onRequestClose={onClose}>
      <div>
        <p>{message}</p>
        <button onClick={onClose}>Close</button>
      </div>
    </Modal>
  );
};

export default Popup;
