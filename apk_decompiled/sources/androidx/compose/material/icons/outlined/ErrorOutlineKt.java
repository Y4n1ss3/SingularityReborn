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
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ErrorOutlineKt {
    private static ImageVector _errorOutline;

    public static final ImageVector getErrorOutline(Icons.Outlined outlined) {
        ImageVector imageVector = _errorOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ErrorOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        bv.m(n, -2.0f, 11.0f, 7.0f, 2.0f);
        uo.D(n, 6.0f, -2.0f, 11.0f, 7.0f);
        n.moveTo(11.99f, 2.0f);
        n.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        n.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        n.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        n.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        n.close();
        n.moveTo(12.0f, 20.0f);
        n.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        n.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        n.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(n, -3.58f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _errorOutline = build;
        build.getClass();
        return build;
    }
}
