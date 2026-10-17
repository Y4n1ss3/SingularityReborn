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
import defpackage.gy;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.Rounded rounded) {
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChildFriendly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(13.0f, 3.08f, 13.0f, 10.0f, 8.0f);
        k.curveToRelative(0.0f, -4.03f, -2.98f, -7.37f, -6.86f, -7.92f);
        k.curveToRelative(-0.6f, -0.09f, -1.14f, 0.39f, -1.14f, 1.0f);
        k.close();
        k.moveTo(19.32f, 15.89f);
        k.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        k.lineTo(6.44f, 11.0f);
        k.lineToRelative(-0.68f, -1.43f);
        k.curveTo(5.6f, 9.22f, 5.24f, 9.0f, 4.86f, 9.0f);
        k.lineTo(3.0f, 9.0f);
        k.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        k.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        k.horizontalLineToRelative(1.22f);
        k.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        k.curveToRelative(-1.33f, 0.71f, -2.14f, 2.27f, -1.74f, 3.94f);
        k.curveToRelative(0.3f, 1.26f, 1.34f, 2.27f, 2.6f, 2.55f);
        k.curveToRelative(2.1f, 0.46f, 3.98f, -0.96f, 4.25f, -2.91f);
        k.horizontalLineToRelative(2.08f);
        k.curveToRelative(0.27f, 1.94f, 2.14f, 3.36f, 4.22f, 2.92f);
        k.curveToRelative(1.27f, -0.27f, 2.31f, -1.27f, 2.63f, -2.53f);
        k.curveToRelative(0.35f, -1.39f, -0.14f, -2.68f, -1.06f, -3.5f);
        k.close();
        k.moveTo(8.0f, 20.0f);
        k.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        k.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        k.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        k.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        k.close();
        k.moveTo(17.0f, 20.0f);
        k.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        k.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        k.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(k, 17.83f, 20.0f, 17.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childFriendly = build;
        build.getClass();
        return build;
    }
}
