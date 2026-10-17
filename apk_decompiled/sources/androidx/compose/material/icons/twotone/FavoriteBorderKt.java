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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FavoriteBorderKt {
    private static ImageVector _favoriteBorder;

    public static final ImageVector getFavoriteBorder(Icons.TwoTone twoTone) {
        ImageVector imageVector = _favoriteBorder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FavoriteBorder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 3.0f);
        b.curveToRelative(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        b.curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        b.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        b.curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        b.lineTo(12.0f, 21.35f);
        b.lineToRelative(1.45f, -1.32f);
        b.curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        b.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        k4.x(b, 12.1f, 18.55f, -0.1f, 0.1f);
        b.lineToRelative(-0.1f, -0.1f);
        b.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        b.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        b.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        b.horizontalLineToRelative(1.87f);
        b.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        b.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        b.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favoriteBorder = build;
        build.getClass();
        return build;
    }
}
