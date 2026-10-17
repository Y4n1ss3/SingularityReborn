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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveKt {
    private static ImageVector _save;

    public static final ImageVector getSave(Icons.TwoTone twoTone) {
        ImageVector imageVector = _save;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Save", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(5.0f, 5.0f, 14.0f, 14.0f);
        m.lineTo(19.0f, 7.83f);
        r6.C(m, 16.17f, 5.0f, 5.0f, 5.0f);
        m.moveTo(12.0f, 18.0f);
        m.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        m.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        m.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        m.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        k4.r(m, 15.0f, 10.0f, 6.0f, 10.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(m, 6.0f, 6.0f, 9.0f, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.o(i, 21.0f, 7.0f, -4.0f, -4.0f);
        i.moveTo(19.0f, 19.0f);
        i.lineTo(5.0f, 19.0f);
        i.lineTo(5.0f, 5.0f);
        i.horizontalLineToRelative(11.17f);
        r6.C(i, 19.0f, 7.83f, 19.0f, 19.0f);
        i.moveTo(12.0f, 12.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        r6.B(i, 6.0f, 6.0f, 9.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _save = build;
        build.getClass();
        return build;
    }
}
