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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RefreshKt {
    private static ImageVector _refresh;

    public static final ImageVector getRefresh(Icons.Rounded rounded) {
        ImageVector imageVector = _refresh;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Refresh", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.65f, 6.35f);
        b.curveToRelative(-1.63f, -1.63f, -3.94f, -2.57f, -6.48f, -2.31f);
        b.curveToRelative(-3.67f, 0.37f, -6.69f, 3.35f, -7.1f, 7.02f);
        b.curveTo(3.52f, 15.91f, 7.27f, 20.0f, 12.0f, 20.0f);
        b.curveToRelative(3.19f, 0.0f, 5.93f, -1.87f, 7.21f, -4.56f);
        b.curveToRelative(0.32f, -0.67f, -0.16f, -1.44f, -0.9f, -1.44f);
        b.curveToRelative(-0.37f, 0.0f, -0.72f, 0.2f, -0.88f, 0.53f);
        b.curveToRelative(-1.13f, 2.43f, -3.84f, 3.97f, -6.8f, 3.31f);
        b.curveToRelative(-2.22f, -0.49f, -4.01f, -2.3f, -4.48f, -4.52f);
        b.curveTo(5.31f, 9.44f, 8.26f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        b.lineToRelative(-1.51f, 1.51f);
        b.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        b.horizontalLineTo(19.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(6.41f);
        b.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -0.64f, 0.65f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _refresh = build;
        build.getClass();
        return build;
    }
}
