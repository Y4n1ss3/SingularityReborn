package androidx.compose.material.icons.outlined;

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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NatureKt {
    private static ImageVector _nature;

    public static final ImageVector getNature(Icons.Outlined outlined) {
        ImageVector imageVector = _nature;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Nature", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(13.0f, 16.12f, -0.03f);
        a.curveToRelative(3.49f, -0.4f, 6.2f, -3.36f, 6.2f, -6.95f);
        a.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        a.reflectiveCurveToRelative(-7.0f, 3.13f, -7.0f, 7.0f);
        a.curveToRelative(0.0f, 3.47f, 2.52f, 6.34f, 5.83f, 6.89f);
        bv.A(a, 20.0f, 5.0f, 2.0f, 14.0f);
        r6.p(a, -2.0f, -6.0f, -3.88f);
        a.moveTo(7.17f, 9.17f);
        a.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        a.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        a.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -5.0f, -2.24f, -5.0f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nature = build;
        build.getClass();
        return build;
    }
}
