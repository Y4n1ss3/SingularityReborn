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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlashOffKt {
    private static ImageVector _flashOff;

    public static final ImageVector getFlashOff(Icons.Outlined outlined) {
        ImageVector imageVector = _flashOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FlashOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-3.61f);
        pathBuilder.lineToRelative(2.28f, 2.28f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 2.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        uo.t(pathBuilder, 1.61f, 6.13f, 6.13f);
        pathBuilder.moveTo(3.41f, 2.86f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        fc.w(pathBuilder, 7.0f, 13.0f, 3.0f, 9.0f);
        pathBuilder.lineToRelative(3.58f, -6.15f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(pathBuilder, 17.73f, 20.0f, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashOff = build;
        build.getClass();
        return build;
    }
}
