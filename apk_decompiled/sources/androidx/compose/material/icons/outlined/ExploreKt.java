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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExploreKt {
    private static ImageVector _explore;

    public static final ImageVector getExplore(Icons.Outlined outlined) {
        ImageVector imageVector = _explore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Explore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        k4.x(b, 6.5f, 17.5f, 7.51f, -3.49f);
        b.lineTo(17.5f, 6.5f);
        r6.C(b, 9.99f, 9.99f, 6.5f, 17.5f);
        b.moveTo(12.0f, 10.9f);
        b.curveToRelative(0.61f, 0.0f, 1.1f, 0.49f, 1.1f, 1.1f);
        b.reflectiveCurveToRelative(-0.49f, 1.1f, -1.1f, 1.1f);
        b.reflectiveCurveToRelative(-1.1f, -0.49f, -1.1f, -1.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.49f, -1.1f, 1.1f, -1.1f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _explore = build;
        build.getClass();
        return build;
    }
}
