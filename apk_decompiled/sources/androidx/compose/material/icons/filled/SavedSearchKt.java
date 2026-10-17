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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavedSearchKt {
    private static ImageVector _savedSearch;

    public static final ImageVector getSavedSearch(Icons.Filled filled) {
        ImageVector imageVector = _savedSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SavedSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        i.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        i.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        i.reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f);
        i.reflectiveCurveTo(5.91f, 16.0f, 9.5f, 16.0f);
        i.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        i.lineToRelative(0.27f, 0.28f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(5.0f, 4.99f);
        bv.o(i, 20.49f, 19.0f, -4.99f, -5.0f);
        i.moveTo(9.5f, 14.0f);
        i.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        i.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        i.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        i.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        k4.x(i, 7.33f, 12.5f, 2.14f, -1.53f);
        i.lineToRelative(2.14f, 1.53f);
        i.lineToRelative(-0.83f, -2.46f);
        i.lineToRelative(2.15f, -1.5f);
        i.horizontalLineToRelative(-2.62f);
        i.lineTo(9.47f, 6.0f);
        i.lineToRelative(-0.84f, 2.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 6.0f, 8.54f, 2.14f, 1.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savedSearch = build;
        build.getClass();
        return build;
    }
}
