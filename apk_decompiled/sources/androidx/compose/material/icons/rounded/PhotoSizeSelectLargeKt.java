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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoSizeSelectLargeKt {
    private static ImageVector _photoSizeSelectLarge;

    public static final ImageVector getPhotoSizeSelectLarge(Icons.Rounded rounded) {
        ImageVector imageVector = _photoSizeSelectLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoSizeSelectLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(21.0f, 15.0f, 2.0f, 2.0f, -2.0f);
        bv.m(n, -2.0f, 21.0f, 11.0f, 2.0f);
        r6.p(n, 2.0f, -2.0f, -2.0f);
        k4.C(n, 23.0f, 19.0f, -2.0f, 2.0f);
        n.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        r6.B(n, 13.0f, 3.0f, 2.0f, 2.0f);
        gy.n(n, -2.0f, 13.0f, 3.0f);
        k4.C(n, 21.0f, 7.0f, 2.0f, 2.0f);
        gy.n(n, -2.0f, 21.0f, 7.0f);
        bv.y(n, 21.0f, 3.0f, 2.0f, 2.0f);
        n.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        r6.B(n, 1.0f, 7.0f, 2.0f, 2.0f);
        r6.C(n, 1.0f, 9.0f, 1.0f, 7.0f);
        k4.C(n, 17.0f, 3.0f, 2.0f, 2.0f);
        gy.n(n, -2.0f, 17.0f, 3.0f);
        k4.C(n, 17.0f, 19.0f, 2.0f, 2.0f);
        fc.x(n, -2.0f, -2.0f, 3.0f, 3.0f);
        n.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        gy.n(n, 2.0f, 3.0f, 3.0f);
        k4.C(n, 9.0f, 3.0f, 2.0f, 2.0f);
        r6.C(n, 9.0f, 5.0f, 9.0f, 3.0f);
        k4.C(n, 5.0f, 3.0f, 2.0f, 2.0f);
        r6.C(n, 5.0f, 5.0f, 5.0f, 3.0f);
        n.moveTo(1.0f, 11.0f);
        n.verticalLineToRelative(8.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(12.0f);
        n.verticalLineToRelative(-8.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.l(n, 1.0f, 11.0f, 3.63f, 18.19f);
        n.lineToRelative(1.49f, -1.91f);
        n.curveToRelative(0.2f, -0.25f, 0.57f, -0.26f, 0.78f, -0.01f);
        n.lineToRelative(1.39f, 1.67f);
        n.lineToRelative(2.1f, -2.7f);
        n.curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f);
        n.lineToRelative(2.22f, 2.96f);
        n.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        n.lineTo(4.02f, 19.01f);
        n.curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectLarge = build;
        build.getClass();
        return build;
    }
}
