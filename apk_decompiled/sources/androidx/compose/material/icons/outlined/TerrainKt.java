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
public final class TerrainKt {
    private static ImageVector _terrain;

    public static final ImageVector getTerrain(Icons.Outlined outlined) {
        ImageVector imageVector = _terrain;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Terrain", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.0f, 6.0f, -4.22f, 5.63f);
        e.lineToRelative(1.25f, 1.67f);
        e.lineTo(14.0f, 9.33f);
        e.lineTo(19.0f, 16.0f);
        e.horizontalLineToRelative(-8.46f);
        e.lineToRelative(-4.01f, -5.37f);
        e.lineTo(1.0f, 18.0f);
        gy.n(e, 22.0f, 14.0f, 6.0f);
        e.moveTo(5.0f, 16.0f);
        e.lineToRelative(1.52f, -2.03f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(e, 8.04f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _terrain = build;
        build.getClass();
        return build;
    }
}
