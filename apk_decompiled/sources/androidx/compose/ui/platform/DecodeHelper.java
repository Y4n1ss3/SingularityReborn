package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidColor_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m6728decodeBaselineShifty9eOQZs() {
        return BaselineShift.m7352constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        long m6730decodeColor0d7_KjU = m6730decodeColor0d7_KjU();
        float decodeFloat = decodeFloat();
        float decodeFloat2 = decodeFloat();
        return new Shadow(m6730decodeColor0d7_KjU, Offset.m4508constructorimpl((Float.floatToRawIntBits(decodeFloat2) & 4294967295L) | (Float.floatToRawIntBits(decodeFloat) << 32)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        return TextDecoration.Companion.valueOf(decodeInt());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m6729decodeULongsVKNKU() {
        return this.parcel.readLong();
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m6730decodeColor0d7_KjU() {
        return AndroidColor_androidKt.fromColorLong(Color.Companion, this.parcel.readLong());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m6731decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        return decodeByte == 0 ? FontStyle.Companion.m7179getNormal_LCdwA() : decodeByte == 1 ? FontStyle.Companion.m7178getItalic_LCdwA() : FontStyle.Companion.m7179getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m6732decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        return decodeByte == 0 ? FontSynthesis.Companion.m7190getNoneGVVA2EU() : decodeByte == 1 ? FontSynthesis.Companion.m7189getAllGVVA2EU() : decodeByte == 3 ? FontSynthesis.Companion.m7191getStyleGVVA2EU() : decodeByte == 2 ? FontSynthesis.Companion.m7192getWeightGVVA2EU() : FontSynthesis.Companion.m7190getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte != 1) {
                if (decodeByte != 2) {
                    if (decodeByte != 3) {
                        if (decodeByte != 4) {
                            if (decodeByte != 5) {
                                if (decodeByte != 6) {
                                    if (decodeByte != 7) {
                                        if (decodeByte != 8) {
                                            if (decodeByte != 9) {
                                                if (decodeByte != 10) {
                                                    if (decodeByte != 11) {
                                                        if (decodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m6780setBackground8_81llA(m6730decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m6781setBaselineShift_isdbwI(BaselineShift.m7351boximpl(m6728decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m6786setLetterSpacingR2X_6o(m6733decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m6785setFontSynthesistDdu0R4(FontSynthesis.m7180boximpl(m6732decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m6784setFontStylemLjRB2g(FontStyle.m7169boximpl(m6731decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m6783setFontSizeR2X_6o(m6733decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m6782setColor8_81llA(m6730decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m6733decodeTextUnitXSAIIZE() {
        TextUnitType.Companion companion;
        long m7839getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            companion = TextUnitType.Companion;
            m7839getUnspecifiedUIouoOA = companion.m7838getSpUIouoOA();
        } else if (decodeByte == 2) {
            companion = TextUnitType.Companion;
            m7839getUnspecifiedUIouoOA = companion.m7837getEmUIouoOA();
        } else {
            companion = TextUnitType.Companion;
            m7839getUnspecifiedUIouoOA = companion.m7839getUnspecifiedUIouoOA();
        }
        return TextUnitType.m7833equalsimpl0(m7839getUnspecifiedUIouoOA, companion.m7839getUnspecifiedUIouoOA()) ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : TextUnitKt.m7817TextUnitanM5pPY(decodeFloat(), m7839getUnspecifiedUIouoOA);
    }
}
