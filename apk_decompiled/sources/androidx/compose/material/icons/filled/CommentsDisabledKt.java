package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommentsDisabledKt {
    private static ImageVector _commentsDisabled;

    public static final ImageVector getCommentsDisabled(Icons.Filled filled) {
        ImageVector imageVector = _commentsDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CommentsDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(16.83f, 14.0f, 18.0f, -2.0f, -3.17f);
        kp0.v(i, -1.0f, -1.0f, 18.0f, 9.0f);
        r6.t(i, -6.17f, -1.0f, -1.0f, 18.0f);
        i.verticalLineTo(6.0f);
        i.horizontalLineTo(8.83f);
        i.lineToRelative(-4.0f, -4.0f);
        i.horizontalLineTo(20.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kf0.t(i, 15.17f, 16.83f, 14.0f);
        i.moveTo(2.1f, 2.1f);
        i.lineTo(0.69f, 3.51f);
        i.lineTo(2.0f, 4.83f);
        i.verticalLineTo(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(11.17f);
        i.lineToRelative(5.31f, 5.31f);
        gy.B(i, 1.41f, -1.41f, 2.1f, 2.1f);
        i.moveTo(6.0f, 9.0f);
        r6.t(i, 0.17f, 2.0f, 2.0f, 6.0f);
        kf0.D(i, 9.0f, 6.0f, 14.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(i, 3.17f, 2.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commentsDisabled = build;
        build.getClass();
        return build;
    }
}
