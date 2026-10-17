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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkAddedKt {
    private static ImageVector _bookmarkAdded;

    public static final ImageVector getBookmarkAdded(Icons.Filled filled) {
        ImageVector imageVector = _bookmarkAdded;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BookmarkAdded", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.0f, 21.0f, -7.0f, -3.0f);
        e.lineToRelative(-7.0f, 3.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e.lineToRelative(7.0f, 0.0f);
        e.curveToRelative(-0.63f, 0.84f, -1.0f, 1.87f, -1.0f, 3.0f);
        e.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        e.curveToRelative(0.34f, 0.0f, 0.68f, -0.03f, 1.0f, -0.1f);
        bv.t(e, 21.0f, 17.83f, 9.0f);
        e.lineTo(15.0f, 6.17f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(3.54f, -3.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.41f, 1.41f, 17.83f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkAdded = build;
        build.getClass();
        return build;
    }
}
