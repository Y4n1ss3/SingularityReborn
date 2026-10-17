package androidx.compose.material.icons.outlined;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FavoriteKt {
    private static ImageVector _favorite;

    public static final ImageVector getFavorite(Icons.Outlined outlined) {
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Favorite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 21.35f, -1.45f, -1.32f);
        e.curveTo(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        e.curveTo(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        e.curveToRelative(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        e.curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        e.curveTo(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        e.curveToRelative(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 12.0f, 21.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        build.getClass();
        return build;
    }
}
