package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridGoldenratioKt {
    private static ImageVector _gridGoldenratio;

    public static final ImageVector getGridGoldenratio(Icons.Rounded rounded) {
        ImageVector imageVector = _gridGoldenratio;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GridGoldenratio", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 13.0f, -6.0f, -2.0f, 6.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        n.horizontalLineToRelative(-6.0f);
        n.verticalLineTo(3.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        bv.x(n, 6.0f, -2.0f, 3.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.reflectiveCurveTo(9.0f, 2.45f, 9.0f, 3.0f);
        n.verticalLineToRelative(6.0f);
        n.horizontalLineTo(3.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        k4.k(n, 6.0f, 2.0f, 3.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        n.horizontalLineToRelative(6.0f);
        n.verticalLineToRelative(6.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(n, -6.0f, 2.0f, 6.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        n.verticalLineToRelative(-6.0f);
        n.horizontalLineToRelative(6.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.reflectiveCurveTo(21.55f, 13.0f, 21.0f, 13.0f);
        r6.B(n, 13.0f, 13.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(n, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridGoldenratio = build;
        build.getClass();
        return build;
    }
}
