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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Rounded rounded) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Map", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.65f, 4.98f, -5.0f, -1.75f);
        e.curveToRelative(-0.42f, -0.15f, -0.88f, -0.15f, -1.3f, -0.01f);
        e.lineTo(4.36f, 4.56f);
        e.curveTo(3.55f, 4.84f, 3.0f, 5.6f, 3.0f, 6.46f);
        e.verticalLineToRelative(11.85f);
        e.curveToRelative(0.0f, 1.41f, 1.41f, 2.37f, 2.72f, 1.86f);
        e.lineToRelative(2.93f, -1.14f);
        e.curveToRelative(0.22f, -0.09f, 0.47f, -0.09f, 0.69f, -0.01f);
        e.lineToRelative(5.0f, 1.75f);
        e.curveToRelative(0.42f, 0.15f, 0.88f, 0.15f, 1.3f, 0.01f);
        e.lineToRelative(3.99f, -1.34f);
        e.curveToRelative(0.81f, -0.27f, 1.36f, -1.04f, 1.36f, -1.9f);
        e.verticalLineTo(5.69f);
        e.curveToRelative(0.0f, -1.41f, -1.41f, -2.37f, -2.72f, -1.86f);
        e.lineToRelative(-2.93f, 1.14f);
        e.curveToRelative(-0.22f, 0.08f, -0.46f, 0.09f, -0.69f, 0.01f);
        k4.x(e, 15.0f, 18.89f, -6.0f, -2.11f);
        e.verticalLineTo(5.11f);
        e.lineToRelative(6.0f, 2.11f);
        e.verticalLineToRelative(11.67f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = build;
        build.getClass();
        return build;
    }
}
