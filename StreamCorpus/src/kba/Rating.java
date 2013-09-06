/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package kba;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ratings are buman generated assertions about a entire document's
 * utility for a particular topic or entity in a reference KB.
 */
public class Rating implements org.apache.thrift.TBase<Rating, Rating._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Rating");

  private static final org.apache.thrift.protocol.TField ANNOTATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("annotator", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("target", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField RELEVANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("relevance", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField CONTAINS_MENTION_FIELD_DESC = new org.apache.thrift.protocol.TField("contains_mention", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField COMMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("comments", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MENTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("mentions", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RatingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RatingTupleSchemeFactory());
  }

  /**
   * identifies the source of this Rating
   */
  public Annotator annotator; // required
  /**
   * identifies the information need assessed by annotator
   */
  public Target target; // required
  /**
   * numerical score assigned by annotator to "judge" or "rate" the
   * utility of this StreamItem to addressing the target information
   * need.  The range and interpretation of relevance numbers depends
   * on the annotator.  relevance can represent a rank ordering or an
   * enumeration such as -1=Garbage, 0=Neutral, 1=Useful, 2=Vital
   */
  public short relevance; // optional
  /**
   * true|false indication of whether the document mentions the target
   * entity.  This is only partially correlated with relevance.  For
   * example, a document might mention the entity only in chrome text
   * on the side such that it is a Garbage-rated text for that entity.
   */
  public boolean contains_mention; // optional
  /**
   * Save notes from Annotator about this Rating
   */
  public String comments; // optional
  /**
   * Record strings that are "mentions" of the target in this text
   */
  public List<String> mentions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * identifies the source of this Rating
     */
    ANNOTATOR((short)1, "annotator"),
    /**
     * identifies the information need assessed by annotator
     */
    TARGET((short)2, "target"),
    /**
     * numerical score assigned by annotator to "judge" or "rate" the
     * utility of this StreamItem to addressing the target information
     * need.  The range and interpretation of relevance numbers depends
     * on the annotator.  relevance can represent a rank ordering or an
     * enumeration such as -1=Garbage, 0=Neutral, 1=Useful, 2=Vital
     */
    RELEVANCE((short)3, "relevance"),
    /**
     * true|false indication of whether the document mentions the target
     * entity.  This is only partially correlated with relevance.  For
     * example, a document might mention the entity only in chrome text
     * on the side such that it is a Garbage-rated text for that entity.
     */
    CONTAINS_MENTION((short)4, "contains_mention"),
    /**
     * Save notes from Annotator about this Rating
     */
    COMMENTS((short)5, "comments"),
    /**
     * Record strings that are "mentions" of the target in this text
     */
    MENTIONS((short)6, "mentions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ANNOTATOR
          return ANNOTATOR;
        case 2: // TARGET
          return TARGET;
        case 3: // RELEVANCE
          return RELEVANCE;
        case 4: // CONTAINS_MENTION
          return CONTAINS_MENTION;
        case 5: // COMMENTS
          return COMMENTS;
        case 6: // MENTIONS
          return MENTIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RELEVANCE_ISSET_ID = 0;
  private static final int __CONTAINS_MENTION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.RELEVANCE,_Fields.CONTAINS_MENTION,_Fields.COMMENTS,_Fields.MENTIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOTATOR, new org.apache.thrift.meta_data.FieldMetaData("annotator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Annotator.class)));
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("target", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Target.class)));
    tmpMap.put(_Fields.RELEVANCE, new org.apache.thrift.meta_data.FieldMetaData("relevance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.CONTAINS_MENTION, new org.apache.thrift.meta_data.FieldMetaData("contains_mention", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COMMENTS, new org.apache.thrift.meta_data.FieldMetaData("comments", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MENTIONS, new org.apache.thrift.meta_data.FieldMetaData("mentions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Rating.class, metaDataMap);
  }

  public Rating() {
  }

  public Rating(
    Annotator annotator,
    Target target)
  {
    this();
    this.annotator = annotator;
    this.target = target;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Rating(Rating other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAnnotator()) {
      this.annotator = new Annotator(other.annotator);
    }
    if (other.isSetTarget()) {
      this.target = new Target(other.target);
    }
    this.relevance = other.relevance;
    this.contains_mention = other.contains_mention;
    if (other.isSetComments()) {
      this.comments = other.comments;
    }
    if (other.isSetMentions()) {
      List<String> __this__mentions = new ArrayList<String>();
      for (String other_element : other.mentions) {
        __this__mentions.add(other_element);
      }
      this.mentions = __this__mentions;
    }
  }

  public Rating deepCopy() {
    return new Rating(this);
  }

  @Override
  public void clear() {
    this.annotator = null;
    this.target = null;
    setRelevanceIsSet(false);
    this.relevance = 0;
    setContains_mentionIsSet(false);
    this.contains_mention = false;
    this.comments = null;
    this.mentions = null;
  }

  /**
   * identifies the source of this Rating
   */
  public Annotator getAnnotator() {
    return this.annotator;
  }

  /**
   * identifies the source of this Rating
   */
  public Rating setAnnotator(Annotator annotator) {
    this.annotator = annotator;
    return this;
  }

  public void unsetAnnotator() {
    this.annotator = null;
  }

  /** Returns true if field annotator is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnotator() {
    return this.annotator != null;
  }

  public void setAnnotatorIsSet(boolean value) {
    if (!value) {
      this.annotator = null;
    }
  }

  /**
   * identifies the information need assessed by annotator
   */
  public Target getTarget() {
    return this.target;
  }

  /**
   * identifies the information need assessed by annotator
   */
  public Rating setTarget(Target target) {
    this.target = target;
    return this;
  }

  public void unsetTarget() {
    this.target = null;
  }

  /** Returns true if field target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return this.target != null;
  }

  public void setTargetIsSet(boolean value) {
    if (!value) {
      this.target = null;
    }
  }

  /**
   * numerical score assigned by annotator to "judge" or "rate" the
   * utility of this StreamItem to addressing the target information
   * need.  The range and interpretation of relevance numbers depends
   * on the annotator.  relevance can represent a rank ordering or an
   * enumeration such as -1=Garbage, 0=Neutral, 1=Useful, 2=Vital
   */
  public short getRelevance() {
    return this.relevance;
  }

  /**
   * numerical score assigned by annotator to "judge" or "rate" the
   * utility of this StreamItem to addressing the target information
   * need.  The range and interpretation of relevance numbers depends
   * on the annotator.  relevance can represent a rank ordering or an
   * enumeration such as -1=Garbage, 0=Neutral, 1=Useful, 2=Vital
   */
  public Rating setRelevance(short relevance) {
    this.relevance = relevance;
    setRelevanceIsSet(true);
    return this;
  }

  public void unsetRelevance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELEVANCE_ISSET_ID);
  }

  /** Returns true if field relevance is set (has been assigned a value) and false otherwise */
  public boolean isSetRelevance() {
    return EncodingUtils.testBit(__isset_bitfield, __RELEVANCE_ISSET_ID);
  }

  public void setRelevanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELEVANCE_ISSET_ID, value);
  }

  /**
   * true|false indication of whether the document mentions the target
   * entity.  This is only partially correlated with relevance.  For
   * example, a document might mention the entity only in chrome text
   * on the side such that it is a Garbage-rated text for that entity.
   */
  public boolean isContains_mention() {
    return this.contains_mention;
  }

  /**
   * true|false indication of whether the document mentions the target
   * entity.  This is only partially correlated with relevance.  For
   * example, a document might mention the entity only in chrome text
   * on the side such that it is a Garbage-rated text for that entity.
   */
  public Rating setContains_mention(boolean contains_mention) {
    this.contains_mention = contains_mention;
    setContains_mentionIsSet(true);
    return this;
  }

  public void unsetContains_mention() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTAINS_MENTION_ISSET_ID);
  }

  /** Returns true if field contains_mention is set (has been assigned a value) and false otherwise */
  public boolean isSetContains_mention() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTAINS_MENTION_ISSET_ID);
  }

  public void setContains_mentionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTAINS_MENTION_ISSET_ID, value);
  }

  /**
   * Save notes from Annotator about this Rating
   */
  public String getComments() {
    return this.comments;
  }

  /**
   * Save notes from Annotator about this Rating
   */
  public Rating setComments(String comments) {
    this.comments = comments;
    return this;
  }

  public void unsetComments() {
    this.comments = null;
  }

  /** Returns true if field comments is set (has been assigned a value) and false otherwise */
  public boolean isSetComments() {
    return this.comments != null;
  }

  public void setCommentsIsSet(boolean value) {
    if (!value) {
      this.comments = null;
    }
  }

  public int getMentionsSize() {
    return (this.mentions == null) ? 0 : this.mentions.size();
  }

  public java.util.Iterator<String> getMentionsIterator() {
    return (this.mentions == null) ? null : this.mentions.iterator();
  }

  public void addToMentions(String elem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<String>();
    }
    this.mentions.add(elem);
  }

  /**
   * Record strings that are "mentions" of the target in this text
   */
  public List<String> getMentions() {
    return this.mentions;
  }

  /**
   * Record strings that are "mentions" of the target in this text
   */
  public Rating setMentions(List<String> mentions) {
    this.mentions = mentions;
    return this;
  }

  public void unsetMentions() {
    this.mentions = null;
  }

  /** Returns true if field mentions is set (has been assigned a value) and false otherwise */
  public boolean isSetMentions() {
    return this.mentions != null;
  }

  public void setMentionsIsSet(boolean value) {
    if (!value) {
      this.mentions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ANNOTATOR:
      if (value == null) {
        unsetAnnotator();
      } else {
        setAnnotator((Annotator)value);
      }
      break;

    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        setTarget((Target)value);
      }
      break;

    case RELEVANCE:
      if (value == null) {
        unsetRelevance();
      } else {
        setRelevance((Short)value);
      }
      break;

    case CONTAINS_MENTION:
      if (value == null) {
        unsetContains_mention();
      } else {
        setContains_mention((Boolean)value);
      }
      break;

    case COMMENTS:
      if (value == null) {
        unsetComments();
      } else {
        setComments((String)value);
      }
      break;

    case MENTIONS:
      if (value == null) {
        unsetMentions();
      } else {
        setMentions((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOTATOR:
      return getAnnotator();

    case TARGET:
      return getTarget();

    case RELEVANCE:
      return Short.valueOf(getRelevance());

    case CONTAINS_MENTION:
      return Boolean.valueOf(isContains_mention());

    case COMMENTS:
      return getComments();

    case MENTIONS:
      return getMentions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ANNOTATOR:
      return isSetAnnotator();
    case TARGET:
      return isSetTarget();
    case RELEVANCE:
      return isSetRelevance();
    case CONTAINS_MENTION:
      return isSetContains_mention();
    case COMMENTS:
      return isSetComments();
    case MENTIONS:
      return isSetMentions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Rating)
      return this.equals((Rating)that);
    return false;
  }

  public boolean equals(Rating that) {
    if (that == null)
      return false;

    boolean this_present_annotator = true && this.isSetAnnotator();
    boolean that_present_annotator = true && that.isSetAnnotator();
    if (this_present_annotator || that_present_annotator) {
      if (!(this_present_annotator && that_present_annotator))
        return false;
      if (!this.annotator.equals(that.annotator))
        return false;
    }

    boolean this_present_target = true && this.isSetTarget();
    boolean that_present_target = true && that.isSetTarget();
    if (this_present_target || that_present_target) {
      if (!(this_present_target && that_present_target))
        return false;
      if (!this.target.equals(that.target))
        return false;
    }

    boolean this_present_relevance = true && this.isSetRelevance();
    boolean that_present_relevance = true && that.isSetRelevance();
    if (this_present_relevance || that_present_relevance) {
      if (!(this_present_relevance && that_present_relevance))
        return false;
      if (this.relevance != that.relevance)
        return false;
    }

    boolean this_present_contains_mention = true && this.isSetContains_mention();
    boolean that_present_contains_mention = true && that.isSetContains_mention();
    if (this_present_contains_mention || that_present_contains_mention) {
      if (!(this_present_contains_mention && that_present_contains_mention))
        return false;
      if (this.contains_mention != that.contains_mention)
        return false;
    }

    boolean this_present_comments = true && this.isSetComments();
    boolean that_present_comments = true && that.isSetComments();
    if (this_present_comments || that_present_comments) {
      if (!(this_present_comments && that_present_comments))
        return false;
      if (!this.comments.equals(that.comments))
        return false;
    }

    boolean this_present_mentions = true && this.isSetMentions();
    boolean that_present_mentions = true && that.isSetMentions();
    if (this_present_mentions || that_present_mentions) {
      if (!(this_present_mentions && that_present_mentions))
        return false;
      if (!this.mentions.equals(that.mentions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Rating other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Rating typedOther = (Rating)other;

    lastComparison = Boolean.valueOf(isSetAnnotator()).compareTo(typedOther.isSetAnnotator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnotator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.annotator, typedOther.annotator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTarget()).compareTo(typedOther.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target, typedOther.target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRelevance()).compareTo(typedOther.isSetRelevance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelevance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relevance, typedOther.relevance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContains_mention()).compareTo(typedOther.isSetContains_mention());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContains_mention()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contains_mention, typedOther.contains_mention);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComments()).compareTo(typedOther.isSetComments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comments, typedOther.comments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMentions()).compareTo(typedOther.isSetMentions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMentions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mentions, typedOther.mentions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Rating(");
    boolean first = true;

    sb.append("annotator:");
    if (this.annotator == null) {
      sb.append("null");
    } else {
      sb.append(this.annotator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("target:");
    if (this.target == null) {
      sb.append("null");
    } else {
      sb.append(this.target);
    }
    first = false;
    if (isSetRelevance()) {
      if (!first) sb.append(", ");
      sb.append("relevance:");
      sb.append(this.relevance);
      first = false;
    }
    if (isSetContains_mention()) {
      if (!first) sb.append(", ");
      sb.append("contains_mention:");
      sb.append(this.contains_mention);
      first = false;
    }
    if (isSetComments()) {
      if (!first) sb.append(", ");
      sb.append("comments:");
      if (this.comments == null) {
        sb.append("null");
      } else {
        sb.append(this.comments);
      }
      first = false;
    }
    if (isSetMentions()) {
      if (!first) sb.append(", ");
      sb.append("mentions:");
      if (this.mentions == null) {
        sb.append("null");
      } else {
        sb.append(this.mentions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (annotator != null) {
      annotator.validate();
    }
    if (target != null) {
      target.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RatingStandardSchemeFactory implements SchemeFactory {
    public RatingStandardScheme getScheme() {
      return new RatingStandardScheme();
    }
  }

  private static class RatingStandardScheme extends StandardScheme<Rating> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Rating struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOTATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.annotator = new Annotator();
              struct.annotator.read(iprot);
              struct.setAnnotatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.target = new Target();
              struct.target.read(iprot);
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RELEVANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.relevance = iprot.readI16();
              struct.setRelevanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTAINS_MENTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.contains_mention = iprot.readBool();
              struct.setContains_mentionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COMMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comments = iprot.readString();
              struct.setCommentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MENTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list146 = iprot.readListBegin();
                struct.mentions = new ArrayList<String>(_list146.size);
                for (int _i147 = 0; _i147 < _list146.size; ++_i147)
                {
                  String _elem148; // required
                  _elem148 = iprot.readString();
                  struct.mentions.add(_elem148);
                }
                iprot.readListEnd();
              }
              struct.setMentionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Rating struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.annotator != null) {
        oprot.writeFieldBegin(ANNOTATOR_FIELD_DESC);
        struct.annotator.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.target != null) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        struct.target.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRelevance()) {
        oprot.writeFieldBegin(RELEVANCE_FIELD_DESC);
        oprot.writeI16(struct.relevance);
        oprot.writeFieldEnd();
      }
      if (struct.isSetContains_mention()) {
        oprot.writeFieldBegin(CONTAINS_MENTION_FIELD_DESC);
        oprot.writeBool(struct.contains_mention);
        oprot.writeFieldEnd();
      }
      if (struct.comments != null) {
        if (struct.isSetComments()) {
          oprot.writeFieldBegin(COMMENTS_FIELD_DESC);
          oprot.writeString(struct.comments);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mentions != null) {
        if (struct.isSetMentions()) {
          oprot.writeFieldBegin(MENTIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.mentions.size()));
            for (String _iter149 : struct.mentions)
            {
              oprot.writeString(_iter149);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RatingTupleSchemeFactory implements SchemeFactory {
    public RatingTupleScheme getScheme() {
      return new RatingTupleScheme();
    }
  }

  private static class RatingTupleScheme extends TupleScheme<Rating> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Rating struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAnnotator()) {
        optionals.set(0);
      }
      if (struct.isSetTarget()) {
        optionals.set(1);
      }
      if (struct.isSetRelevance()) {
        optionals.set(2);
      }
      if (struct.isSetContains_mention()) {
        optionals.set(3);
      }
      if (struct.isSetComments()) {
        optionals.set(4);
      }
      if (struct.isSetMentions()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetAnnotator()) {
        struct.annotator.write(oprot);
      }
      if (struct.isSetTarget()) {
        struct.target.write(oprot);
      }
      if (struct.isSetRelevance()) {
        oprot.writeI16(struct.relevance);
      }
      if (struct.isSetContains_mention()) {
        oprot.writeBool(struct.contains_mention);
      }
      if (struct.isSetComments()) {
        oprot.writeString(struct.comments);
      }
      if (struct.isSetMentions()) {
        {
          oprot.writeI32(struct.mentions.size());
          for (String _iter150 : struct.mentions)
          {
            oprot.writeString(_iter150);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Rating struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.annotator = new Annotator();
        struct.annotator.read(iprot);
        struct.setAnnotatorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.target = new Target();
        struct.target.read(iprot);
        struct.setTargetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.relevance = iprot.readI16();
        struct.setRelevanceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.contains_mention = iprot.readBool();
        struct.setContains_mentionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.comments = iprot.readString();
        struct.setCommentsIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list151 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.mentions = new ArrayList<String>(_list151.size);
          for (int _i152 = 0; _i152 < _list151.size; ++_i152)
          {
            String _elem153; // required
            _elem153 = iprot.readString();
            struct.mentions.add(_elem153);
          }
        }
        struct.setMentionsIsSet(true);
      }
    }
  }

}

