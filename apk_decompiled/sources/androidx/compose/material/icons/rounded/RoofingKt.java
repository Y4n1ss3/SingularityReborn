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
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoofingKt {
    private static ImageVector _roofing;

    public static final ImageVector getRoofing(Icons.Rounded rounded) {
        ImageVector imageVector = _roofing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Roofing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 18.0f, -2.0f, -2.0f, 2.0f);
        kf0.D(n, 18.0f, 9.0f, 15.0f, 4.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.horizontalLineToRelative(4.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.verticalLineToRelative(-4.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.horizontalLineToRelative(-4.0f);
        n.curveTo(9.45f, 14.0f, 9.0f, 14.45f, 9.0f, 15.0f);
        k4.r(n, 19.0f, 9.3f, 19.0f, 9.3f);
        n.verticalLineTo(5.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.horizontalLineToRelative(-1.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.verticalLineToRelative(1.6f);
        n.verticalLineToRelative(0.0f);
        n.lineToRelative(-3.33f, -3.0f);
        n.curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f);
        n.lineToRelative(-8.36f, 7.53f);
        n.curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f);
        n.horizontalLineToRelative(1.31f);
        n.curveToRelative(0.25f, 0.0f, 0.49f, -0.09f, 0.67f, -0.26f);
        n.lineTo(12.0f, 5.69f);
        n.lineToRelative(6.71f, 6.05f);
        n.curveTo(18.9f, 11.91f, 19.14f, 12.0f, 19.38f, 12.0f);
        n.horizontalLineToRelative(1.31f);
        n.curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 19.0f, 9.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roofing = build;
        build.getClass();
        return build;
    }
}
