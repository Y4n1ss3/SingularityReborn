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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpOffAltKt {
    private static ImageVector _thumbUpOffAlt;

    public static final ImageVector getThumbUpOffAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbUpOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbUpOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(9.0f, 21.0f, 9.0f);
        a.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        a.lineToRelative(3.02f, -7.05f);
        a.curveTo(22.95f, 12.5f, 23.0f, 12.26f, 23.0f, 12.0f);
        a.verticalLineToRelative(-2.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-6.31f);
        a.lineToRelative(0.95f, -4.57f);
        a.lineToRelative(0.03f, -0.32f);
        a.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        a.lineTo(14.17f, 1.0f);
        a.lineTo(7.58f, 7.59f);
        a.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        a.verticalLineToRelative(10.0f);
        a.curveTo(7.0f, 20.1f, 7.9f, 21.0f, 9.0f, 21.0f);
        k4.x(a, 9.0f, 9.0f, 4.34f, -4.34f);
        fc.w(a, 12.0f, 10.0f, 9.0f, 2.0f);
        a.lineToRelative(-3.0f, 7.0f);
        a.horizontalLineTo(9.0f);
        a.verticalLineTo(9.0f);
        a.close();
        k4.C(a, 1.0f, 9.0f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(a, 1.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpOffAlt = build;
        build.getClass();
        return build;
    }
}
