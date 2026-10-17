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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavedSearchKt {
    private static ImageVector _savedSearch;

    public static final ImageVector getSavedSearch(Icons.Rounded rounded) {
        ImageVector imageVector = _savedSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SavedSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.73f, 13.31f);
        b.curveToRelative(1.13f, -1.55f, 1.63f, -3.58f, 0.98f, -5.74f);
        b.curveToRelative(-0.68f, -2.23f, -2.57f, -3.98f, -4.85f, -4.44f);
        b.curveTo(6.21f, 2.2f, 2.2f, 6.22f, 3.14f, 10.86f);
        b.curveToRelative(0.46f, 2.29f, 2.21f, 4.18f, 4.44f, 4.85f);
        b.curveToRelative(2.16f, 0.65f, 4.19f, 0.15f, 5.74f, -0.98f);
        b.lineToRelative(5.56f, 5.56f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(b, 14.73f, 13.31f, 9.5f, 14.0f);
        b.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        b.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        b.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 11.99f, 14.0f, 9.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.29f, 8.44f, -0.79f, -2.44f);
        e.lineToRelative(-0.79f, 2.44f);
        e.lineToRelative(-2.46f, 0.0f);
        e.lineToRelative(2.01f, 1.59f);
        e.lineToRelative(-0.77f, 2.47f);
        e.lineToRelative(2.01f, -1.53f);
        e.lineToRelative(2.01f, 1.53f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -0.77f, -2.47f, 2.01f, -1.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savedSearch = build;
        build.getClass();
        return build;
    }
}
