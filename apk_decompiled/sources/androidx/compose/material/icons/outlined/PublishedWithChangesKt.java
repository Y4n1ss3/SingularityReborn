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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.Outlined outlined) {
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PublishedWithChanges", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(18.6f, 19.5f, 21.0f, 2.0f, -6.0f);
        kf0.z(i, -6.0f, 2.0f, 2.73f);
        i.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.23f);
        i.curveToRelative(0.0f, -4.07f, -3.06f, -7.44f, -7.0f, -7.93f);
        i.verticalLineTo(2.05f);
        i.curveToRelative(5.05f, 0.5f, 9.0f, 4.76f, 9.0f, 9.95f);
        i.curveTo(22.0f, 14.99f, 20.68f, 17.67f, 18.6f, 19.5f);
        i.close();
        i.moveTo(4.0f, 12.0f);
        i.curveToRelative(0.0f, -2.52f, 1.17f, -4.77f, 3.0f, -6.23f);
        j50.B(i, 8.5f, 2.0f, -6.0f, 3.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineToRelative(2.4f);
        i.curveTo(3.32f, 6.33f, 2.0f, 9.01f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        i.verticalLineToRelative(-2.02f);
        i.curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f);
        k4.x(i, 16.24f, 8.11f, -5.66f, 5.66f);
        i.lineToRelative(-2.83f, -2.83f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineToRelative(4.24f, 4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 7.07f, -7.07f, 16.24f, 8.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = build;
        build.getClass();
        return build;
    }
}
