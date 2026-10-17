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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddedKt {
    private static ImageVector _bookmarkAdded;

    public static final ImageVector getBookmarkAdded(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bookmarkAdded;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BookmarkAdded", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 17.97f, 0.0f, -7.07f);
        e.curveToRelative(-2.28f, -0.46f, -4.0f, -2.48f, -4.0f, -4.9f);
        e.curveToRelative(0.0f, -0.34f, 0.03f, -0.68f, 0.1f, -1.0f);
        e.lineTo(7.0f, 5.0f);
        e.verticalLineToRelative(12.97f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 5.0f, -2.14f, 17.0f, 17.97f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.83f, 9.0f, 15.0f, 6.17f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(3.54f, -3.54f);
        gy.B(i, 1.41f, 1.41f, 17.83f, 9.0f);
        i.moveTo(17.0f, 17.97f);
        i.lineToRelative(-5.0f, -2.14f);
        i.lineToRelative(-5.0f, 2.14f);
        i.verticalLineTo(5.0f);
        i.lineToRelative(6.1f, 0.0f);
        i.curveToRelative(0.15f, -0.74f, 0.46f, -1.42f, 0.9f, -2.0f);
        i.lineTo(7.0f, 3.0f);
        i.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        i.verticalLineToRelative(16.0f);
        i.lineToRelative(7.0f, -3.0f);
        i.lineToRelative(7.0f, 3.0f);
        i.lineToRelative(0.0f, -10.1f);
        i.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        i.curveToRelative(-0.34f, 0.0f, -0.68f, -0.03f, -1.0f, -0.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 17.0f, 17.97f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdded = build;
        build.getClass();
        return build;
    }
}
