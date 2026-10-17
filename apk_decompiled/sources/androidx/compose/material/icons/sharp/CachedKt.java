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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CachedKt {
    private static ImageVector _cached;

    public static final ImageVector getCached(Icons.Sharp sharp) {
        ImageVector imageVector = _cached;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Cached", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(19.0f, 8.0f, -4.0f, 4.0f, 3.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.curveToRelative(-1.01f, 0.0f, -1.97f, -0.25f, -2.8f, -0.7f);
        b.lineToRelative(-1.46f, 1.46f);
        b.curveTo(8.97f, 19.54f, 10.43f, 20.0f, 12.0f, 20.0f);
        b.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        uo.w(b, 3.0f, -4.0f, -4.0f);
        b.moveTo(6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b.curveToRelative(1.01f, 0.0f, 1.97f, 0.25f, 2.8f, 0.7f);
        b.lineToRelative(1.46f, -1.46f);
        b.curveTo(15.03f, 4.46f, 13.57f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.horizontalLineTo(1.0f);
        b.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(b, 4.0f, -4.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cached = build;
        build.getClass();
        return build;
    }
}
