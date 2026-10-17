package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import defpackage.dq;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.q10;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Savers_androidKt {
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new ll0(13), new kl0(17));
    private static final Saver<EmojiSupportMatch, Object> emojiSupportMatchSaver = SaverKt.Saver(new ll0(14), new kl0(18));
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new ll0(15), new kl0(19));
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new ll0(16), new kl0(20));
    private static final Saver<TextMotion.Linearity, Object> TextMotionLinearitySaver = SaverKt.Saver(new ll0(17), new kl0(21));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineBreakSaver$lambda$0(SaverScope saverScope, LineBreak lineBreak) {
        return Integer.valueOf(lineBreak.m7399unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineBreak LineBreakSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineBreak.m7387boximpl(LineBreak.m7388constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object PlatformParagraphStyleSaver$lambda$0(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
        return y80.a(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m6907boximpl(platformParagraphStyle.m6988getEmojiSupportMatch_3YsG6Y()), getSaver(EmojiSupportMatch.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformParagraphStyle PlatformParagraphStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        Saver<EmojiSupportMatch, Object> saver = getSaver(EmojiSupportMatch.Companion);
        EmojiSupportMatch restore = ((!q10.b(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        restore.getClass();
        return new PlatformParagraphStyle(restore.m6913unboximpl(), booleanValue, (dq) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionLinearitySaver$lambda$0(SaverScope saverScope, TextMotion.Linearity linearity) {
        return Integer.valueOf(linearity.m7530unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion.Linearity TextMotionLinearitySaver$lambda$1(Object obj) {
        obj.getClass();
        return TextMotion.Linearity.m7524boximpl(TextMotion.Linearity.m7525constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionSaver$lambda$0(SaverScope saverScope, TextMotion textMotion) {
        return y80.a(SaversKt.save(TextMotion.Linearity.m7524boximpl(textMotion.m7523getLinearity4e0Vf04$ui_text()), getSaver(TextMotion.Linearity.Companion), saverScope), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion TextMotionSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<TextMotion.Linearity, Object> saver = getSaver(TextMotion.Linearity.Companion);
        TextMotion.Linearity restore = ((!q10.b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        restore.getClass();
        int m7530unboximpl = restore.m7530unboximpl();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        bool.getClass();
        return new TextMotion(m7530unboximpl, bool.booleanValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object emojiSupportMatchSaver$lambda$0(SaverScope saverScope, EmojiSupportMatch emojiSupportMatch) {
        return Integer.valueOf(emojiSupportMatch.m6913unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiSupportMatch emojiSupportMatchSaver$lambda$1(Object obj) {
        obj.getClass();
        return EmojiSupportMatch.m6907boximpl(EmojiSupportMatch.m6908constructorimpl(((Integer) obj).intValue()));
    }

    public static final Saver<EmojiSupportMatch, Object> getEmojiSupportMatchSaver() {
        return emojiSupportMatchSaver;
    }

    public static final Saver<PlatformParagraphStyle, Object> getSaver(PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    public static final Saver<EmojiSupportMatch, Object> getSaver(EmojiSupportMatch.Companion companion) {
        return emojiSupportMatchSaver;
    }

    public static final Saver<LineBreak, Object> getSaver(LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    public static final Saver<TextMotion, Object> getSaver(TextMotion.Companion companion) {
        return TextMotionSaver;
    }

    private static final Saver<TextMotion.Linearity, Object> getSaver(TextMotion.Linearity.Companion companion) {
        return TextMotionLinearitySaver;
    }
}
