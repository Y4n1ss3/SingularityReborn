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
public final class BeenhereKt {
    private static ImageVector _beenhere;

    public static final ImageVector getBeenhere(Icons.TwoTone twoTone) {
        ImageVector imageVector = _beenhere;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Beenhere", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(19.0f, 3.0f, 5.0f, 3.0f, 12.93f);
        s.lineToRelative(7.0f, 4.66f);
        gy.B(s, 7.0f, -4.67f, 19.0f, 3.0f);
        s.moveTo(10.0f, 16.0f);
        s.lineToRelative(-4.0f, -4.0f);
        s.lineToRelative(1.41f, -1.41f);
        s.lineToRelative(2.58f, 2.58f);
        s.lineToRelative(6.59f, -6.59f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(s, 18.0f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 1.0f, 5.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(3.0f, 15.93f);
        i.curveToRelative(0.0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f);
        i.lineTo(12.0f, 23.0f);
        i.lineToRelative(8.11f, -5.41f);
        i.curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f);
        i.lineTo(21.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 12.0f, 20.6f, -7.0f, -4.66f);
        fc.w(i, 5.0f, 3.0f, 14.0f, 12.93f);
        fc.B(i, -7.0f, 4.67f, 9.99f, 13.18f);
        i.lineToRelative(-2.58f, -2.59f);
        i.lineTo(6.0f, 12.0f);
        i.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 8.0f, -8.0f, -1.42f, -1.42f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beenhere = build;
        build.getClass();
        return build;
    }
}
