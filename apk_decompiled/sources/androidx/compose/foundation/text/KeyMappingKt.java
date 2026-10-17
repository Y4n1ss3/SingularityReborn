package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import defpackage.gh0;
import defpackage.ky;
import defpackage.wf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new gh0() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            {
                Object obj = wf.NO_RECEIVER;
            }

            @Override // defpackage.y20
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m5936isCtrlPressedZmokQxo(((KeyEvent) obj).m5921unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1116mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m5936isCtrlPressedZmokQxo(keyEvent)) {
                    long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5689getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5690getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5691getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5686getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m5936isCtrlPressedZmokQxo(keyEvent)) {
                    long m5932getKeyZmokQxo2 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion2 = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5689getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5690getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5691getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5686getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5724getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5684getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5630getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5629getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent)) {
                    long m5932getKeyZmokQxo3 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion3 = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5765getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5764getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m5935isAltPressedZmokQxo(keyEvent)) {
                    long m5932getKeyZmokQxo4 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion4 = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo4, companion4.m5630getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m5612equalsimpl0(m5932getKeyZmokQxo4, companion4.m5684getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo1116mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final ky kyVar) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1116mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (((Boolean) ky.this.invoke(KeyEvent.m5915boximpl(keyEvent))).booleanValue() && KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), Key.Companion.m5910getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) ky.this.invoke(KeyEvent.m5915boximpl(keyEvent))).booleanValue()) {
                    long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5667getCEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5731getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5899getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5907getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5617getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5908getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5910getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m5936isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent)) {
                    long m5932getKeyZmokQxo2 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion2 = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5689getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5690getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5691getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5686getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5812getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5811getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5765getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5764getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo2, companion2.m5731getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long m5932getKeyZmokQxo3 = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                Key.Companion companion3 = Key.Companion;
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5689getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5690getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5691getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5686getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5685getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5812getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5811getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5765getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5764getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5699getEnterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5796getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5630getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5684getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5814getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5682getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5679getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m5612equalsimpl0(m5932getKeyZmokQxo3, companion3.m5860getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
