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
import defpackage.bv;
import defpackage.c21;
import defpackage.er;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueueMusicKt {
    private static ImageVector _queueMusic;

    public static final ImageVector getQueueMusic(Icons.Outlined outlined) {
        ImageVector imageVector = _queueMusic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.QueueMusic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(22.0f, 6.0f, -5.0f, 8.18f);
        b.curveTo(16.69f, 14.07f, 16.35f, 14.0f, 16.0f, 14.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        c21.c(b, 8.0f, 3.0f, 6.0f);
        k4.A(b, 15.0f, 6.0f, 3.0f, 2.0f);
        uo.r(b, 12.0f, 6.0f, 15.0f, 10.0f);
        bv.h(b, 3.0f, 2.0f, 12.0f, 10.0f);
        k4.A(b, 11.0f, 14.0f, 3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 8.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queueMusic = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getQueueMusic$annotations(Icons.Outlined outlined) {
    }
}
