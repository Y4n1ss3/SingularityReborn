package androidx.compose.material.icons.sharp;

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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.Sharp sharp) {
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PublishedWithChanges", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.66f, 9.53f, -7.07f, 7.07f);
        e.lineToRelative(-4.24f, -4.24f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(2.83f, 2.83f);
        gy.B(e, 5.66f, -5.66f, 17.66f, 9.53f);
        e.moveTo(4.0f, 12.0f);
        e.curveToRelative(0.0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f);
        kf0.u(e, 9.0f, 8.5f, -6.0f, 3.0f);
        e.lineToRelative(2.2f, 2.2f);
        e.curveTo(3.24f, 6.52f, 2.0f, 9.11f, 2.0f, 12.0f);
        e.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        e.verticalLineToRelative(-2.02f);
        e.curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f);
        e.close();
        e.moveTo(22.0f, 12.0f);
        e.curveToRelative(0.0f, -5.19f, -3.95f, -9.45f, -9.0f, -9.95f);
        e.verticalLineToRelative(2.02f);
        e.curveToRelative(3.94f, 0.49f, 7.0f, 3.86f, 7.0f, 7.93f);
        e.curveToRelative(0.0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f);
        af0.m(e, 15.0f, 15.5f, 6.0f, 6.0f);
        e.lineToRelative(-2.2f, -2.2f);
        e.curveTo(20.76f, 17.48f, 22.0f, 14.89f, 22.0f, 12.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = build;
        build.getClass();
        return build;
    }
}
