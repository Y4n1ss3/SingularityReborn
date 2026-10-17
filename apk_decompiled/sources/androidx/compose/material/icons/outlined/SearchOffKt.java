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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchOffKt {
    private static ImageVector _searchOff;

    public static final ImageVector getSearchOff(Icons.Outlined outlined) {
        ImageVector imageVector = _searchOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SearchOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        i.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        i.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        i.curveTo(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f);
        i.horizontalLineToRelative(2.02f);
        i.curveTo(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f);
        i.curveTo(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
        i.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        i.curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        i.verticalLineToRelative(2.02f);
        i.curveTo(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f);
        i.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        i.lineTo(14.0f, 14.71f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(5.0f, 4.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 20.49f, 19.0f, 15.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.47f, 10.82f, -2.47f, 2.47f);
        e.lineToRelative(-2.47f, -2.47f);
        e.lineToRelative(-0.71f, 0.71f);
        e.lineToRelative(2.47f, 2.47f);
        e.lineToRelative(-2.47f, 2.47f);
        e.lineToRelative(0.71f, 0.71f);
        e.lineToRelative(2.47f, -2.47f);
        e.lineToRelative(2.47f, 2.47f);
        e.lineToRelative(0.71f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -2.47f, -2.47f, 2.47f, -2.47f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _searchOff = build;
        build.getClass();
        return build;
    }
}
