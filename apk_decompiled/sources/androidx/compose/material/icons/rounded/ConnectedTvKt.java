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
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Rounded rounded) {
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectedTv", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 3.0f, 4.0f);
        d.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(4.0f);
        d.verticalLineToRelative(1.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(6.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-1.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        d.lineTo(22.0f, 5.0f);
        d.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        c21.d(d, 20.0f, 17.0f, 4.0f, 5.0f);
        uo.r(d, 16.0f, 17.0f, 7.0f, 15.97f);
        d.curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14.0f);
        bv.h(d, 5.0f, 2.0f, 2.0f, 15.97f);
        d.moveTo(5.62f, 12.55f);
        d.curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f);
        d.curveTo(8.51f, 15.75f, 8.82f, 16.0f, 9.18f, 16.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.46f, 0.0f, 0.82f, -0.41f, 0.75f, -0.86f);
        d.curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f);
        d.curveTo(5.41f, 11.0f, 5.0f, 11.36f, 5.0f, 11.82f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(5.0f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f);
        d.close();
        d.moveTo(5.64f, 9.53f);
        d.curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f);
        d.curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f);
        d.curveToRelative(0.45f, 0.0f, 0.79f, -0.4f, 0.75f, -0.85f);
        d.curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f);
        d.curveTo(5.4f, 8.0f, 5.0f, 8.34f, 5.0f, 8.79f);
        d.curveTo(5.0f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectedTv = build;
        build.getClass();
        return build;
    }
}
