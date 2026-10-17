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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavedSearchKt {
    private static ImageVector _savedSearch;

    public static final ImageVector getSavedSearch(Icons.TwoTone twoTone) {
        ImageVector imageVector = _savedSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SavedSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.73f, 13.31f);
        b.curveTo(15.52f, 12.24f, 16.0f, 10.93f, 16.0f, 9.5f);
        b.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        b.reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f);
        b.curveTo(3.0f, 13.09f, 5.91f, 16.0f, 9.5f, 16.0f);
        b.curveToRelative(1.43f, 0.0f, 2.74f, -0.48f, 3.81f, -1.27f);
        b.lineTo(19.59f, 21.0f);
        r6.C(b, 21.0f, 19.59f, 14.73f, 13.31f);
        b.moveTo(9.5f, 14.0f);
        b.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        b.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        b.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 11.99f, 14.0f, 9.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.5f, 6.0f, -0.79f, 2.44f);
        e.lineToRelative(-2.46f, 0.0f);
        e.lineToRelative(2.01f, 1.59f);
        e.lineToRelative(-0.77f, 2.47f);
        e.lineToRelative(2.01f, -1.53f);
        e.lineToRelative(2.01f, 1.53f);
        e.lineToRelative(-0.77f, -2.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 2.01f, -1.59f, -2.46f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savedSearch = build;
        build.getClass();
        return build;
    }
}
