package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
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
import androidx.compose.ui.unit.TextUnitType;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        long m7001getColor0d7_KjU = spanStyle.m7001getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m4762equalsimpl0(m7001getColor0d7_KjU, companion.m4797getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m6754encode8_81llA(spanStyle.m7001getColor0d7_KjU());
        }
        long m7002getFontSizeXSAIIZE = spanStyle.m7002getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m7802equalsimpl0(m7002getFontSizeXSAIIZE, companion2.m7816getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m6751encodeR2X_6o(spanStyle.m7002getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m7003getFontStyle4Lr2A7w = spanStyle.m7003getFontStyle4Lr2A7w();
        if (m7003getFontStyle4Lr2A7w != null) {
            int m7175unboximpl = m7003getFontStyle4Lr2A7w.m7175unboximpl();
            encode((byte) 4);
            m6756encodenzbMABs(m7175unboximpl);
        }
        FontSynthesis m7004getFontSynthesisZQGJjVo = spanStyle.m7004getFontSynthesisZQGJjVo();
        if (m7004getFontSynthesisZQGJjVo != null) {
            int m7188unboximpl = m7004getFontSynthesisZQGJjVo.m7188unboximpl();
            encode((byte) 5);
            m6753encode6p3vJLY(m7188unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m7802equalsimpl0(spanStyle.m7005getLetterSpacingXSAIIZE(), companion2.m7816getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m6751encodeR2X_6o(spanStyle.m7005getLetterSpacingXSAIIZE());
        }
        BaselineShift m7000getBaselineShift5SSeXJ0 = spanStyle.m7000getBaselineShift5SSeXJ0();
        if (m7000getBaselineShift5SSeXJ0 != null) {
            float m7357unboximpl = m7000getBaselineShift5SSeXJ0.m7357unboximpl();
            encode((byte) 8);
            m6752encode4Dl_Bck(m7357unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m4762equalsimpl0(spanStyle.m6999getBackground0d7_KjU(), companion.m4797getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m6754encode8_81llA(spanStyle.m6999getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m6751encodeR2X_6o(long j) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b = 0;
        if (!TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7839getUnspecifiedUIouoOA())) {
            if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), companion.m7839getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m7805getValueimpl(j));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m6752encode4Dl_Bck(float f) {
        encode(f);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m6753encode6p3vJLY(int i) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b = 0;
        if (!FontSynthesis.m7183equalsimpl0(i, companion.m7190getNoneGVVA2EU())) {
            if (FontSynthesis.m7183equalsimpl0(i, companion.m7189getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m7183equalsimpl0(i, companion.m7192getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m7183equalsimpl0(i, companion.m7191getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m6754encode8_81llA(long j) {
        m6755encodeVKZWuLQ(AndroidColor_androidKt.m4624toColorLong8_81llA(j));
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m6755encodeVKZWuLQ(long j) {
        this.parcel.writeLong(j);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m6756encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b = 0;
        if (!FontStyle.m7172equalsimpl0(i, companion.m7179getNormal_LCdwA()) && FontStyle.m7172equalsimpl0(i, companion.m7178getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m6754encode8_81llA(shadow.m5105getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m5106getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m5106getOffsetF1C5BW0() & 4294967295L)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
