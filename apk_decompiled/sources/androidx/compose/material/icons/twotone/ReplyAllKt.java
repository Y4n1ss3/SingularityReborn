package androidx.compose.material.icons.twotone;

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
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReplyAllKt {
    private static ImageVector _replyAll;

    public static final ImageVector getReplyAll(Icons.TwoTone twoTone) {
        ImageVector imageVector = _replyAll;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ReplyAll", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.0f, 8.0f, 7.0f, 5.0f);
        i.lineToRelative(-7.0f, 7.0f);
        i.lineToRelative(7.0f, 7.0f);
        i.verticalLineToRelative(-3.0f);
        fc.C(i, -4.0f, -4.0f, 4.0f, -4.0f);
        i.moveTo(13.0f, 9.0f);
        i.lineTo(13.0f, 5.0f);
        i.lineToRelative(-7.0f, 7.0f);
        i.lineToRelative(7.0f, 7.0f);
        i.verticalLineToRelative(-4.1f);
        i.curveToRelative(5.0f, 0.0f, 8.5f, 1.6f, 11.0f, 5.1f);
        i.curveToRelative(-1.0f, -5.0f, -4.0f, -10.0f, -11.0f, -11.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replyAll = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getReplyAll$annotations(Icons.TwoTone twoTone) {
    }
}
