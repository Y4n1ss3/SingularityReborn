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
import defpackage.er;
import defpackage.gy;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeMuteKt {
    private static ImageVector _volumeMute;

    public static final ImageVector getVolumeMute(Icons.Outlined outlined) {
        ImageVector imageVector = _volumeMute;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VolumeMute", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(14.0f, 8.83f, 6.34f, 11.83f, 13.0f);
        af0.u(y, 9.0f, -2.0f, 2.83f);
        y.lineTo(14.0f, 8.83f);
        y.moveTo(16.0f, 4.0f);
        j50.x(y, -5.0f, 5.0f, 7.0f, 6.0f);
        y.horizontalLineToRelative(4.0f);
        y.lineToRelative(5.0f, 5.0f);
        y.verticalLineTo(4.0f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeMute = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getVolumeMute$annotations(Icons.Outlined outlined) {
    }
}
