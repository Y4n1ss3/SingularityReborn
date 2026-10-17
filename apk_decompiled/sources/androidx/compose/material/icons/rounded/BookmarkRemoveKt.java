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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BookmarkRemoveKt {
    private static ImageVector _bookmarkRemove;

    public static final ImageVector getBookmarkRemove(Icons.Rounded rounded) {
        ImageVector imageVector = _bookmarkRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BookmarkRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 6.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveTo(20.55f, 5.0f, 21.0f, 5.45f, 21.0f, 6.0f);
        b.close();
        b.moveTo(19.0f, 10.9f);
        b.curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1.0f, 0.1f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -1.13f, 0.37f, -2.16f, 1.0f, -3.0f);
        b.lineTo(7.0f, 3.0f);
        b.curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f);
        b.verticalLineToRelative(14.48f);
        b.curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f);
        b.lineTo(12.0f, 18.0f);
        b.lineToRelative(5.61f, 2.4f);
        b.curveToRelative(0.66f, 0.28f, 1.39f, -0.2f, 1.39f, -0.92f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 10.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookmarkRemove = build;
        build.getClass();
        return build;
    }
}
