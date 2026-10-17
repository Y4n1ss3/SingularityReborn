package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AllOutKt {
    private static ImageVector _allOut;

    public static final ImageVector getAllOut(Icons.Filled filled) {
        ImageVector imageVector = _allOut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AllOut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.21f, 4.16f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.21f, 16.16f);
        uf.r(pathBuilder, -4.0f, 4.0f, 4.0f);
        pathBuilder.moveTo(8.21f, 20.16f);
        uf.v(pathBuilder, -4.0f, -4.0f, 4.0f);
        pathBuilder.moveTo(4.21f, 8.16f);
        uf.r(pathBuilder, 4.0f, -4.0f, -4.0f);
        pathBuilder.moveTo(17.16f, 7.21f);
        pathBuilder.curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-2.73f, 7.17f, 0.0f, 9.9f);
        pathBuilder.reflectiveCurveToRelative(7.17f, 2.73f, 9.9f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(2.73f, -7.16f, 0.0f, -9.9f);
        pathBuilder.close();
        pathBuilder.moveTo(16.06f, 16.01f);
        pathBuilder.curveToRelative(-2.13f, 2.13f, -5.57f, 2.13f, -7.7f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-2.13f, -5.57f, 0.0f, -7.7f);
        pathBuilder.reflectiveCurveToRelative(5.57f, -2.13f, 7.7f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(pathBuilder, 2.13f, 5.57f, 0.0f, 7.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allOut = build;
        build.getClass();
        return build;
    }
}
