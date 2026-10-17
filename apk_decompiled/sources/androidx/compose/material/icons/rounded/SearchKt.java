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
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchKt {
    private static ImageVector _search;

    public static final ImageVector getSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _search;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Search", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        i.curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        i.curveToRelative(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
        i.curveToRelative(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
        i.curveToRelative(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
        i.curveToRelative(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
        i.lineToRelative(0.27f, 0.28f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(4.25f, 4.25f);
        i.curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        i.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        uo.l(i, 15.5f, 14.0f, 9.5f, 14.0f);
        i.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        i.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        i.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 11.99f, 14.0f, 9.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _search = build;
        build.getClass();
        return build;
    }
}
