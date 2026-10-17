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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PictureInPictureKt {
    private static ImageVector _pictureInPicture;

    public static final ImageVector getPictureInPicture(Icons.Outlined outlined) {
        ImageVector imageVector = _pictureInPicture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PictureInPicture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(19.0f, 7.0f, -8.0f, 6.0f, 8.0f);
        uo.l(n, 19.0f, 7.0f, 17.0f, 11.0f);
        uo.n(n, -4.0f, 13.0f, 9.0f, 4.0f);
        r6.l(n, 2.0f, 21.0f, 3.0f);
        n.lineTo(3.0f, 3.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
        n.horizontalLineToRelative(18.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
        n.lineTo(23.0f, 5.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(n, 21.0f, 19.01f, 3.0f, 19.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 3.0f, 4.98f, 18.0f, 14.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pictureInPicture = build;
        build.getClass();
        return build;
    }
}
