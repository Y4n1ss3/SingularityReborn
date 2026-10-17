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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NearMeDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 6.34f, 21.0f, 3.0f);
        i.lineToRelative(-3.34f, 9.0f);
        i.lineToRelative(-1.56f, -1.56f);
        i.lineToRelative(1.5f, -4.05f);
        gy.B(i, -4.05f, 1.5f, 12.0f, 6.34f);
        i.moveTo(21.19f, 21.19f);
        i.lineToRelative(-5.07f, -5.07f);
        i.lineTo(14.31f, 21.0f);
        i.horizontalLineTo(12.9f);
        i.lineToRelative(-2.83f, -7.07f);
        i.lineTo(3.0f, 11.1f);
        i.verticalLineTo(9.69f);
        i.lineToRelative(4.88f, -1.81f);
        i.lineTo(2.81f, 2.81f);
        i.lineToRelative(1.41f, -1.41f);
        gy.B(i, 18.38f, 18.38f, 21.19f, 21.19f);
        i.moveTo(14.57f, 14.57f);
        i.lineTo(9.43f, 9.43f);
        i.lineToRelative(-2.71f, 1.01f);
        i.lineToRelative(4.89f, 1.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.95f, 4.89f, 14.57f, 14.57f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = build;
        build.getClass();
        return build;
    }
}
