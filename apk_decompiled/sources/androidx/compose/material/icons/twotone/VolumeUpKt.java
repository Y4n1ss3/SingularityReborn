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
import defpackage.bv;
import defpackage.c21;
import defpackage.er;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeUpKt {
    private static ImageVector _volumeUp;

    public static final ImageVector getVolumeUp(Icons.TwoTone twoTone) {
        ImageVector imageVector = _volumeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VolumeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(kf0.p(5.0f, 13.0f, 2.83f, 10.0f, 15.17f), 8.83f, 7.83f, 11.0f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(3.0f, 9.0f, 6.0f, 4.0f);
        m.lineToRelative(5.0f, 5.0f);
        m.lineTo(12.0f, 4.0f);
        r6.C(m, 7.0f, 9.0f, 3.0f, 9.0f);
        m.moveTo(10.0f, 8.83f);
        m.verticalLineToRelative(6.34f);
        m.lineTo(7.83f, 13.0f);
        af0.m(m, 5.0f, 13.0f, -2.0f, 2.83f);
        uo.l(m, 10.0f, 8.83f, 14.0f, 7.97f);
        m.verticalLineToRelative(8.05f);
        m.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        m.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        bv.v(m, 14.0f, 3.23f, 2.06f);
        m.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        m.reflectiveCurveToRelative(-2.11f, 5.85f, -5.0f, 6.71f);
        m.verticalLineToRelative(2.06f);
        m.curveToRelative(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
        m.curveToRelative(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeUp = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getVolumeUp$annotations(Icons.TwoTone twoTone) {
    }
}
