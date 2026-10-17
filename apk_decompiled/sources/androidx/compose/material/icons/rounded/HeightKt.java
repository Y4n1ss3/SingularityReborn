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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeightKt {
    private static ImageVector _height;

    public static final ImageVector getHeight(Icons.Rounded rounded) {
        ImageVector imageVector = _height;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Height", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(13.0f, 6.99f, 1.79f);
        a.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        a.lineToRelative(-2.79f, -2.78f);
        a.curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f);
        a.lineTo(8.86f, 6.14f);
        a.curveTo(8.54f, 6.45f, 8.76f, 6.99f, 9.21f, 6.99f);
        r6.y(a, 11.0f, 10.02f, 9.21f);
        a.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        a.lineToRelative(2.79f, 2.78f);
        a.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        a.lineToRelative(2.79f, -2.78f);
        a.curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(a, 13.0f, 6.99f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _height = build;
        build.getClass();
        return build;
    }
}
