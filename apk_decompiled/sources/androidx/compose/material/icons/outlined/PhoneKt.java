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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneKt {
    private static ImageVector _phone;

    public static final ImageVector getPhone(Icons.Outlined outlined) {
        ImageVector imageVector = _phone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Phone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.54f, 5.0f);
        b.curveToRelative(0.06f, 0.89f, 0.21f, 1.76f, 0.45f, 2.59f);
        b.lineToRelative(-1.2f, 1.2f);
        b.curveToRelative(-0.41f, -1.2f, -0.67f, -2.47f, -0.76f, -3.79f);
        b.horizontalLineToRelative(1.51f);
        b.moveToRelative(9.86f, 12.02f);
        b.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        b.verticalLineToRelative(1.49f);
        b.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        b.lineToRelative(1.2f, -1.19f);
        b.moveTo(7.5f, 3.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.49f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        b.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        b.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b.lineToRelative(-2.2f, 2.2f);
        b.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        b.lineToRelative(2.2f, -2.2f);
        b.curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f);
        b.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phone = build;
        build.getClass();
        return build;
    }
}
