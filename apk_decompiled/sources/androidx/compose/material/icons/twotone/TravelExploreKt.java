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
import defpackage.bv;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TravelExploreKt {
    private static ImageVector _travelExplore;

    public static final ImageVector getTravelExplore(Icons.TwoTone twoTone) {
        ImageVector imageVector = _travelExplore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TravelExplore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.3f, 16.9f);
        b.curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f);
        b.curveToRelative(0.0f, -2.5f, -2.0f, -4.5f, -4.5f, -4.5f);
        b.reflectiveCurveTo(11.0f, 12.0f, 11.0f, 14.5f);
        b.reflectiveCurveToRelative(2.0f, 4.5f, 4.5f, 4.5f);
        b.curveToRelative(0.9f, 0.0f, 1.7f, -0.3f, 2.4f, -0.7f);
        b.lineToRelative(3.2f, 3.2f);
        gy.B(b, 1.4f, -1.4f, 19.3f, 16.9f);
        b.moveTo(15.5f, 17.0f);
        b.curveToRelative(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
        b.reflectiveCurveToRelative(1.1f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f);
        b.reflectiveCurveTo(16.9f, 17.0f, 15.5f, 17.0f);
        bv.v(b, 12.0f, 20.0f, 2.0f);
        b.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        b.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        b.curveToRelative(4.84f, 0.0f, 8.87f, 3.44f, 9.8f, 8.0f);
        b.horizontalLineToRelative(-2.07f);
        b.curveToRelative(-0.64f, -2.46f, -2.4f, -4.47f, -4.73f, -5.41f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        uf.k(b, 8.0f, 2.0f, 2.0f, 3.0f);
        b.horizontalLineTo(9.0f);
        b.lineToRelative(-4.79f, -4.79f);
        b.curveTo(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f);
        b.curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _travelExplore = build;
        build.getClass();
        return build;
    }
}
