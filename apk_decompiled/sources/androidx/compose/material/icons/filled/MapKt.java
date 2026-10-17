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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Filled filled) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Map", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.5f, 3.0f, -0.16f, 0.03f);
        e.lineTo(15.0f, 5.1f);
        e.lineTo(9.0f, 3.0f);
        e.lineTo(3.36f, 4.9f);
        e.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        e.verticalLineTo(20.5f);
        e.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        e.lineToRelative(0.16f, -0.03f);
        e.lineTo(9.0f, 18.9f);
        e.lineToRelative(6.0f, 2.1f);
        e.lineToRelative(5.64f, -1.9f);
        e.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        e.verticalLineTo(3.5f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        k4.x(e, 15.0f, 19.0f, -6.0f, -2.11f);
        e.verticalLineTo(5.0f);
        e.lineToRelative(6.0f, 2.11f);
        e.verticalLineTo(19.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = build;
        build.getClass();
        return build;
    }
}
