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
public final class FavoriteKt {
    private static ImageVector _favorite;

    public static final ImageVector getFavorite(Icons.Rounded rounded) {
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Favorite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.35f, 20.13f);
        b.curveToRelative(-0.76f, 0.69f, -1.93f, 0.69f, -2.69f, -0.01f);
        b.lineToRelative(-0.11f, -0.1f);
        b.curveTo(5.3f, 15.27f, 1.87f, 12.16f, 2.0f, 8.28f);
        b.curveToRelative(0.06f, -1.7f, 0.93f, -3.33f, 2.34f, -4.29f);
        b.curveToRelative(2.64f, -1.8f, 5.9f, -0.96f, 7.66f, 1.1f);
        b.curveToRelative(1.76f, -2.06f, 5.02f, -2.91f, 7.66f, -1.1f);
        b.curveToRelative(1.41f, 0.96f, 2.28f, 2.59f, 2.34f, 4.29f);
        b.curveToRelative(0.14f, 3.88f, -3.3f, 6.99f, -8.55f, 11.76f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -0.1f, 0.09f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        build.getClass();
        return build;
    }
}
