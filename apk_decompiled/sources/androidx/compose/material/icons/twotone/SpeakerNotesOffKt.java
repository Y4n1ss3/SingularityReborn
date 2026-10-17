package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SpeakerNotesOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.0f, 11.0f, 6.0f, 9.0f);
        i.lineTo(4.0f, 7.0f);
        i.verticalLineToRelative(10.17f);
        i.lineTo(5.17f, 16.0f);
        i.lineTo(13.0f, 16.0f);
        gy.B(i, -5.0f, -5.0f, 6.0f, 11.0f);
        i.moveTo(8.0f, 14.0f);
        af0.m(i, 6.0f, 14.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 20.0f, 4.0f);
        i.lineTo(6.66f, 4.0f);
        i.lineTo(10.0f, 7.34f);
        fc.w(i, 10.0f, 6.0f, 8.0f, 2.0f);
        i.horizontalLineToRelative(-7.34f);
        i.lineToRelative(1.0f, 1.0f);
        af0.m(i, 18.0f, 9.0f, 2.0f, -4.34f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 5.0f, 5.0f, 20.0f, 16.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(20.0f, 4.0f, 12.0f, -1.34f);
        m.lineToRelative(1.91f, 1.91f);
        m.curveTo(21.39f, 17.66f, 22.0f, 16.9f, 22.0f, 16.0f);
        m.lineTo(22.0f, 4.0f);
        m.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        m.lineTo(4.66f, 2.0f);
        gy.B(m, 2.0f, 2.0f, 20.0f, 4.0f);
        k4.C(m, 6.0f, 12.0f, 2.0f, 2.0f);
        uo.l(m, 6.0f, 14.0f, 18.0f, 11.0f);
        m.lineTo(18.0f, 9.0f);
        uo.w(m, -6.34f, 2.0f, 2.0f);
        m.moveTo(18.0f, 8.0f);
        fc.w(m, 18.0f, 6.0f, -8.0f, 1.34f);
        fc.B(m, 0.66f, 0.66f, 1.41f, 1.59f);
        m.lineTo(0.0f, 3.0f);
        m.lineToRelative(2.0f, 2.01f);
        m.lineTo(2.0f, 22.0f);
        m.lineToRelative(4.0f, -4.0f);
        m.horizontalLineToRelative(9.0f);
        m.lineToRelative(5.73f, 5.73f);
        gy.B(m, 1.41f, -1.41f, 1.41f, 1.59f);
        m.moveTo(5.17f, 16.0f);
        m.lineTo(4.0f, 17.17f);
        m.lineTo(4.0f, 7.0f);
        r6.A(m, 2.0f, 2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(m, 5.0f, 5.0f, 5.17f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotesOff = build;
        build.getClass();
        return build;
    }
}
